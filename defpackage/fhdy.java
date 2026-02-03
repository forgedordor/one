package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdy {
    public final Map a = new ConcurrentHashMap();
    final fexj b;
    final feyq c;
    final List d;
    final List e;

    public fhdy(fexj fexjVar, feyq feyqVar, List list, List list2) {
        this.b = fexjVar;
        this.c = feyqVar;
        this.d = list;
        this.e = list2;
    }

    public final Object a(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new fhdw(this, cls));
    }

    public final fhbv b(Type type, Annotation[] annotationArr) {
        type.getClass();
        annotationArr.getClass();
        List list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            fhbv fhbvVarA = ((fhbu) list.get(i)).a(type, annotationArr, this);
            if (fhbvVarA != null) {
                return fhbvVarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((fhbu) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final fhbv c(Type type) {
        type.getClass();
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
        }
        return fhbg.a;
    }

    public final fhbv d(Type type, Annotation[] annotationArr) {
        type.getClass();
        annotationArr.getClass();
        List list = this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            fhbv fhbvVarB = ((fhbu) list.get(i)).b(type);
            if (fhbvVarB != null) {
                return fhbvVarB;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((fhbu) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
