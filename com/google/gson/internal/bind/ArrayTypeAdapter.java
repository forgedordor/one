package com.google.gson.internal.bind;

import defpackage.esyd;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.etaa;
import defpackage.etbp;
import defpackage.etcz;
import defpackage.etdb;
import defpackage.etdd;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ArrayTypeAdapter extends esyv {
    public static final esyw a = new esyw() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // defpackage.esyw
        public final esyv a(esyd esydVar, etcz etczVar) {
            Type genericComponentType;
            Type type = etczVar.b;
            if (type instanceof GenericArrayType) {
                genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                if (!(type instanceof Class)) {
                    return null;
                }
                Class cls = (Class) type;
                if (!cls.isArray()) {
                    return null;
                }
                genericComponentType = cls.getComponentType();
            }
            return new ArrayTypeAdapter(esydVar, esydVar.a(new etcz(genericComponentType)), etaa.a(genericComponentType));
        }
    };
    private final Class b;
    private final esyv c;

    public ArrayTypeAdapter(esyd esydVar, esyv esyvVar, Class cls) {
        this.c = new etbp(esydVar, esyvVar, cls);
        this.b = cls;
    }

    @Override // defpackage.esyv
    public final Object a(etdb etdbVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        etdbVar.l();
        while (etdbVar.r()) {
            arrayList.add(this.c.a(etdbVar));
        }
        etdbVar.n();
        int size = arrayList.size();
        Class cls = this.b;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // defpackage.esyv
    public final void b(etdd etddVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            etddVar.j();
            return;
        }
        etddVar.e();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.b(etddVar, Array.get(obj, i));
        }
        etddVar.g();
    }
}
