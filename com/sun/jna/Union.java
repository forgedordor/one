package com.sun.jna;

import com.sun.jna.Structure;
import defpackage.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class Union extends Structure {
    private Structure.StructField activeField;

    protected Union() {
    }

    private Structure.StructField findField(Class<?> cls) {
        ensureAllocated();
        for (Structure.StructField structField : fields().values()) {
            if (structField.type.isAssignableFrom(cls)) {
                return structField;
            }
        }
        return null;
    }

    @Override // com.sun.jna.Structure
    protected List<String> getFieldOrder() {
        List<Field> fieldList = getFieldList();
        ArrayList arrayList = new ArrayList(fieldList.size());
        Iterator<Field> it = fieldList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @Override // com.sun.jna.Structure
    protected int getNativeAlignment(Class<?> cls, Object obj, boolean z) {
        return super.getNativeAlignment(cls, obj, true);
    }

    public Object getTypedValue(Class<?> cls) {
        ensureAllocated();
        for (Structure.StructField structField : fields().values()) {
            if (structField.type == cls) {
                this.activeField = structField;
                read();
                return getFieldValue(this.activeField.field);
            }
        }
        throw new IllegalArgumentException(a.p(cls, this, "No field of type ", " in "));
    }

    @Override // com.sun.jna.Structure
    protected Object readField(Structure.StructField structField) {
        if (structField == this.activeField || !(Structure.class.isAssignableFrom(structField.type) || String.class.isAssignableFrom(structField.type) || WString.class.isAssignableFrom(structField.type))) {
            return super.readField(structField);
        }
        return null;
    }

    public void setType(Class<?> cls) {
        ensureAllocated();
        for (Structure.StructField structField : fields().values()) {
            if (structField.type == cls) {
                this.activeField = structField;
                return;
            }
        }
        throw new IllegalArgumentException(a.p(cls, this, "No field of type ", " in "));
    }

    public Object setTypedValue(Object obj) throws IllegalAccessException, IllegalArgumentException {
        Structure.StructField structFieldFindField = findField(obj.getClass());
        if (structFieldFindField != null) {
            this.activeField = structFieldFindField;
            setFieldValue(structFieldFindField.field, obj);
            return this;
        }
        throw new IllegalArgumentException("No field of type " + String.valueOf(obj.getClass()) + " in " + toString());
    }

    @Override // com.sun.jna.Structure
    protected void writeField(Structure.StructField structField) {
        if (structField == this.activeField) {
            super.writeField(structField);
        }
    }

    protected Union(Pointer pointer) {
        super(pointer);
    }

    @Override // com.sun.jna.Structure
    public void writeField(String str) {
        ensureAllocated();
        setType(str);
        super.writeField(str);
    }

    protected Union(Pointer pointer, int i) {
        super(pointer, i);
    }

    protected Union(Pointer pointer, int i, TypeMapper typeMapper) {
        super(pointer, i, typeMapper);
    }

    protected Union(TypeMapper typeMapper) {
        super(typeMapper);
    }

    @Override // com.sun.jna.Structure
    public void writeField(String str, Object obj) throws IllegalAccessException, IllegalArgumentException {
        ensureAllocated();
        setType(str);
        super.writeField(str, obj);
    }

    @Override // com.sun.jna.Structure
    public Object readField(String str) {
        ensureAllocated();
        setType(str);
        return super.readField(str);
    }

    public void setType(String str) {
        ensureAllocated();
        Structure.StructField structField = fields().get(str);
        if (structField != null) {
            this.activeField = structField;
            return;
        }
        throw new IllegalArgumentException(a.G(str, this, "No field named ", " in "));
    }
}
