public class Example {
  
}


class Foo {}                                // OK
//class Bar implements Foo {}               // No! Can't implement a class
interface Baz {}                            // OK
interface Fi {}                             // OK
//interface Zee implements Baz {}           // No! an interface can't implement an interface
//interface Zee implements Foo {}           // No! an interface can't implement a class
//interface Zoo extends Foo()               // No! an interface can't extends a class
interface Boo extends Fi {}                 // OK
//class Toon extends Foo, Button {}         // No! a class can't extends multiple class
class Zoom implements Fi, Baz {}            // OK
interface Vroom extends Fi, Baz {}          // OK
class Yow extends Foo implements Fi {}      //OK
class Yo2 extends Foo implements Fi, Baz {} //OK