package com.github.scottmansfield.model

/**
 * @author Scott Mansfield
 */
object Component {
  def apply(label: String, dimensions: Dimensions) = {
    new Component(label, dimensions)
  }
}

class Component(label: String, dimensions: Dimensions) {

}
