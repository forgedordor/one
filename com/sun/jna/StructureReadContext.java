package com.sun.jna;

import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StructureReadContext extends FromNativeContext {
    private Field field;
    private Structure structure;

    public StructureReadContext(Structure structure, Field field) {
        super(field.getType());
        this.structure = structure;
        this.field = field;
    }

    public Field getField() {
        return this.field;
    }

    public Structure getStructure() {
        return this.structure;
    }
}
