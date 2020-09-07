package ly.analogical.prehensile

// trait DependencyTree {
//   def elements: List[DependencyTreeElement]
// }

object DependencyTree { // Rose Tree?

  sealed trait Element // Node?
  final case class HasParent(parent: Element) extends Element // Branch?
  final case object Root extends Element // Root?

  // problem: how do we "map" (or traverse) over an Element? They can have arbitrary depth

  sealed trait ElementF[A]
  final case class HasParentF[A](parent: ElementF[A]) extends ElementF[A]
  final case class RootF[A]() extends ElementF[A]

}
