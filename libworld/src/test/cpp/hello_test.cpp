/*
 * This C++ source file was generated by the Gradle 'init' task.
 */

#include "libworld.h"
#include <cassert>

int main() {
    libworld::Greeter greeter;
    assert(greeter.greeting().compare("Hello, World!") == 0);
    return 0;
}
