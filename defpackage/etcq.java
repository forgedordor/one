package defpackage;

import com.google.gson.internal.bind.EnumTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters$29;
import com.google.gson.internal.bind.TypeAdapters$30;
import defpackage.esyd;
import defpackage.esyv;
import defpackage.etci;
import defpackage.etcz;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etcq {
    public static final esyw A;
    public static final esyv B;
    public static final esyw C;
    public static final esyv D;
    public static final esyw E;
    public static final esyv F;
    public static final esyw G;
    public static final esyv H;
    public static final esyw I;
    public static final esyv J;
    public static final esyw K;
    public static final esyv L;
    public static final esyw M;
    public static final esyv N;
    public static final esyw O;
    public static final esyv P;
    public static final esyw Q;
    public static final esyv R;
    public static final esyw S;
    public static final esyv T;
    public static final esyw U;
    public static final esyw V;
    public static final esyv a;
    public static final esyw b;
    public static final esyv c;
    public static final esyw d;
    public static final esyv e;
    public static final esyv f;
    public static final esyw g;
    public static final esyv h;
    public static final esyw i;
    public static final esyv j;
    public static final esyw k;
    public static final esyv l;
    public static final esyw m;
    public static final esyv n;
    public static final esyw o;
    public static final esyv p;
    public static final esyw q;
    public static final esyv r;
    public static final esyw s;
    public static final esyv t;
    public static final esyv u;
    public static final esyw v;
    public static final esyv w;
    public static final esyv x;
    public static final esyv y;
    public static final esyv z;

    static {
        esyv esyvVarD = new etby().d();
        a = esyvVarD;
        b = new TypeAdapters$29(Class.class, esyvVarD);
        esyv esyvVarD2 = new etch().d();
        c = esyvVarD2;
        d = new TypeAdapters$29(BitSet.class, esyvVarD2);
        etcj etcjVar = new etcj();
        e = etcjVar;
        f = new etck();
        g = new TypeAdapters$30(Boolean.TYPE, Boolean.class, etcjVar);
        etcl etclVar = new etcl();
        h = etclVar;
        i = new TypeAdapters$30(Byte.TYPE, Byte.class, etclVar);
        etcm etcmVar = new etcm();
        j = etcmVar;
        k = new TypeAdapters$30(Short.TYPE, Short.class, etcmVar);
        etcn etcnVar = new etcn();
        l = etcnVar;
        m = new TypeAdapters$30(Integer.TYPE, Integer.class, etcnVar);
        esyv esyvVarD3 = new etco().d();
        n = esyvVarD3;
        o = new TypeAdapters$29(AtomicInteger.class, esyvVarD3);
        esyv esyvVarD4 = new etcp().d();
        p = esyvVarD4;
        q = new TypeAdapters$29(AtomicBoolean.class, esyvVarD4);
        esyv esyvVarD5 = new etbq().d();
        r = esyvVarD5;
        s = new TypeAdapters$29(AtomicIntegerArray.class, esyvVarD5);
        t = new etbr();
        etbs etbsVar = new etbs();
        u = etbsVar;
        v = new TypeAdapters$30(Character.TYPE, Character.class, etbsVar);
        etbt etbtVar = new etbt();
        w = etbtVar;
        x = new etbu();
        y = new etbv();
        z = new etbw();
        A = new TypeAdapters$29(String.class, etbtVar);
        etbx etbxVar = new etbx();
        B = etbxVar;
        C = new TypeAdapters$29(StringBuilder.class, etbxVar);
        etbz etbzVar = new etbz();
        D = etbzVar;
        E = new TypeAdapters$29(StringBuffer.class, etbzVar);
        etca etcaVar = new etca();
        F = etcaVar;
        G = new TypeAdapters$29(URL.class, etcaVar);
        etcb etcbVar = new etcb();
        H = etcbVar;
        I = new TypeAdapters$29(URI.class, etcbVar);
        final etcc etccVar = new etcc();
        J = etccVar;
        final Class<InetAddress> cls = InetAddress.class;
        K = new esyw() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // defpackage.esyw
            public final esyv a(esyd esydVar, etcz etczVar) {
                Class cls2 = cls;
                Class<?> cls3 = etczVar.a;
                if (cls2.isAssignableFrom(cls3)) {
                    return new etci(etccVar, cls3);
                }
                return null;
            }

            public final String toString() {
                esyv esyvVar = etccVar;
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + esyvVar.toString() + "]";
            }
        };
        etcd etcdVar = new etcd();
        L = etcdVar;
        M = new TypeAdapters$29(UUID.class, etcdVar);
        esyv esyvVarD6 = new etce().d();
        N = esyvVarD6;
        O = new TypeAdapters$29(Currency.class, esyvVarD6);
        final etcf etcfVar = new etcf();
        P = etcfVar;
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        Q = new esyw() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // defpackage.esyw
            public final esyv a(esyd esydVar, etcz etczVar) {
                Class cls4 = etczVar.a;
                if (cls4 == cls2 || cls4 == cls3) {
                    return etcfVar;
                }
                return null;
            }

            public final String toString() {
                esyv esyvVar = etcfVar;
                Class cls4 = cls3;
                return "Factory[type=" + cls2.getName() + "+" + cls4.getName() + ",adapter=" + esyvVar.toString() + "]";
            }
        };
        etcg etcgVar = new etcg();
        R = etcgVar;
        S = new TypeAdapters$29(Locale.class, etcgVar);
        final etbc etbcVar = etbc.a;
        T = etbcVar;
        final Class<esyj> cls4 = esyj.class;
        U = new esyw() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // defpackage.esyw
            public final esyv a(esyd esydVar, etcz etczVar) {
                Class cls22 = cls4;
                Class<?> cls32 = etczVar.a;
                if (cls22.isAssignableFrom(cls32)) {
                    return new etci(etbcVar, cls32);
                }
                return null;
            }

            public final String toString() {
                esyv esyvVar = etbcVar;
                return "Factory[typeHierarchy=" + cls4.getName() + ",adapter=" + esyvVar.toString() + "]";
            }
        };
        V = EnumTypeAdapter.a;
    }
}
