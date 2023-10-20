package org.example;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

class ClassChecker extends ClassVisitor {
    private final String fullClassName;
    private boolean classFound = false;

    public ClassChecker(String fullClassName) {
        super(Opcodes.ASM9);
        this.fullClassName = fullClassName.replace('.', '/');
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        if (name.equals(fullClassName)) {
            classFound = true;
        }
    }

    public boolean classFound() {
        return classFound;
    }
}
