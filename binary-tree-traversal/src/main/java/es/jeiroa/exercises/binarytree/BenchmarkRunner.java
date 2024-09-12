package es.jeiroa.exercises.binarytree;

import es.jeiroa.exercises.binarytree.traversal.InOrder;
import es.jeiroa.exercises.binarytree.traversal.LevelOrder;
import es.jeiroa.exercises.binarytree.traversal.PostOrder;
import es.jeiroa.exercises.binarytree.traversal.PreOrder;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
/**
 * > mvn clean package
 * > java -jar target/benchmarks.jar
 *
 * Benchmark                                   Mode  Cnt    Score    Error  Units
 * BenchmarkRunner.traverseInOrderIterative    avgt   25  152,025 ± 15,402  ns/op
 * BenchmarkRunner.traverseInOrderRecursive    avgt   25  790,692 ± 44,299  ns/op
 * BenchmarkRunner.traverseLevelOrder          avgt   25  189,328 ±  3,790  ns/op
 * BenchmarkRunner.traversePostOrderIterative  avgt   25  161,843 ±  3,171  ns/op
 * BenchmarkRunner.traversePostOrderRecursive  avgt   25  696,306 ± 12,839  ns/op
 * BenchmarkRunner.traversePreOrderIterative   avgt   25  161,323 ±  2,176  ns/op
 * BenchmarkRunner.traversePreOrderRecursive   avgt   25  686,804 ± 19,211  ns/op
 */
public class BenchmarkRunner {
    private PreOrder preOrderUnit;
    private InOrder inOrderUnit;
    private PostOrder postOrderUnit;
    private LevelOrder levelOrderUnit;

    private TreeNode tree;

    @Setup
    public void prepare() {
        preOrderUnit = new PreOrder();
        inOrderUnit = new InOrder();
        postOrderUnit = new PostOrder();
        levelOrderUnit = new LevelOrder();

        tree = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5,
                                new TreeNode(6),
                                new TreeNode(7)
                        )
                ),
                new TreeNode(3,
                        null,
                        new TreeNode(8,
                                new TreeNode(9),
                                null
                        )
                )
        );
    }

    @Benchmark
    public void traversePreOrderRecursive(Blackhole bh) {
        bh.consume(preOrderUnit.preOrderTraversal(tree));
    }

    @Benchmark
    public void traversePreOrderIterative(Blackhole bh) {
        bh.consume(preOrderUnit.preOrderTraversalIter(tree));
    }

    @Benchmark
    public void traverseInOrderRecursive(Blackhole bh) {
        bh.consume(inOrderUnit.inOrderTraversal(tree));
    }

    @Benchmark
    public void traverseInOrderIterative(Blackhole bh) {
        bh.consume(inOrderUnit.inOrderTraversalIter(tree));
    }

    @Benchmark
    public void traversePostOrderRecursive(Blackhole bh) {
        bh.consume(postOrderUnit.postOrderTraversal(tree));
    }

    @Benchmark
    public void traversePostOrderIterative(Blackhole bh) {
        bh.consume(postOrderUnit.postOrderTraversalIter(tree));
    }

    @Benchmark
    public void traverseLevelOrder(Blackhole bh) {
        bh.consume(levelOrderUnit.levelOrderTraversal(tree));
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(BenchmarkRunner.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
