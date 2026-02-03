package com.google.gson.internal.bind;

import defpackage.esyd;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.esyz;
import defpackage.etcz;
import defpackage.etdb;
import defpackage.etdd;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class EnumTypeAdapter extends esyv {
    public static final esyw a = new esyw() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // defpackage.esyw
        public final esyv a(esyd esydVar, etcz etczVar) {
            Class superclass = etczVar.a;
            if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                return null;
            }
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            return new EnumTypeAdapter(superclass);
        }
    };
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public EnumTypeAdapter(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                esyz esyzVar = (esyz) field2.getAnnotation(esyz.class);
                if (esyzVar != null) {
                    strName = esyzVar.a();
                    for (String str : esyzVar.b()) {
                        this.b.put(str, r4);
                    }
                }
                this.b.put(strName, r4);
                this.c.put(string, r4);
                this.d.put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        String strJ = etdbVar.j();
        Enum r0 = (Enum) this.b.get(strJ);
        return r0 != null ? r0 : (Enum) this.c.get(strJ);
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        Enum r3 = (Enum) obj;
        etddVar.m(r3 == null ? null : (String) this.d.get(r3));
    }
}
