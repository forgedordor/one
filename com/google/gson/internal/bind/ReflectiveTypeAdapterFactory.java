package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import defpackage.a;
import defpackage.esxv;
import defpackage.esyd;
import defpackage.esyk;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.esyx;
import defpackage.eszu;
import defpackage.etar;
import defpackage.etat;
import defpackage.etbg;
import defpackage.etbk;
import defpackage.etbm;
import defpackage.etcv;
import defpackage.etcz;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ReflectiveTypeAdapterFactory implements esyw {
    private final eszu a;
    private final Excluder b;
    private final JsonAdapterAnnotationTypeAdapterFactory c;
    private final List d;
    private final int e;

    public ReflectiveTypeAdapterFactory(eszu eszuVar, int i, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.a = eszuVar;
        this.e = i;
        this.b = excluder;
        this.c = jsonAdapterAnnotationTypeAdapterFactory;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!etar.a(accessibleObject, obj)) {
            throw new esyk(etcv.e(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f5  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.etbl c(defpackage.esyd r29, defpackage.etcz r30, java.lang.Class r31, boolean r32, boolean r33) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(esyd, etcz, java.lang.Class, boolean, boolean):etbl");
    }

    private static IllegalArgumentException d(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + etcv.d(field) + " and " + etcv.d(field2) + "\nSee " + etat.a("duplicate-fields"));
    }

    private final boolean e(Field field, boolean z) {
        Excluder excluder = this.b;
        int i = excluder.c;
        if ((field.getModifiers() & 136) != 0) {
            return false;
        }
        double d = excluder.b;
        if (field.isSynthetic()) {
            return false;
        }
        if (excluder.d) {
            esyx esyxVar = (esyx) field.getAnnotation(esyx.class);
            if (esyxVar == null) {
                return false;
            }
            if (z) {
                if (!esyxVar.b()) {
                    return false;
                }
            } else if (!esyxVar.a()) {
                return false;
            }
        }
        if (excluder.c(field.getType(), z)) {
            return false;
        }
        List list = z ? excluder.e : excluder.f;
        if (list.isEmpty()) {
            return true;
        }
        field.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((esxv) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.esyw
    public final esyv a(esyd esydVar, etcz etczVar) {
        Class cls = etczVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        if (etcv.h(cls)) {
            return new etbg();
        }
        int iB = etar.b(this.d);
        if (iB == 4) {
            throw new esyk(a.I(cls, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = iB == 3;
        return etcv.a.c(cls) ? new etbm(cls, c(esydVar, etczVar, cls, z, true), z) : new etbk(this.a.a(etczVar, true), c(esydVar, etczVar, cls, z, false));
    }
}
