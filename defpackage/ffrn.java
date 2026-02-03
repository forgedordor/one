package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffrn {

    @Deprecated
    public static final ffrn A;

    @Deprecated
    public static final ffrn B;

    @Deprecated
    public static final ffrn C;

    @Deprecated
    public static final ffrn D;
    public static final ffrn E;
    public static final ffrn F;
    public static final ffrn G;
    public static final ffrn H;
    public static final ffrn I;
    public static final ffrn J;
    private static final Map L;
    public static final ffrn a;
    public static final ffrn b;
    public static final ffrn c;
    public static final ffrn d;
    public static final ffrn e;
    public static final ffrn f;
    public static final ffrn g;
    public static final ffrn h;
    public static final ffrn i;
    public static final ffrn j;
    public static final ffrn k;
    public static final ffrn l;
    public static final ffrn m;
    public static final ffrn n;
    public static final ffrn o;
    public static final ffrn p;
    public static final ffrn q;
    public static final ffrn r;
    public static final ffrn s;
    public static final ffrn t;
    public static final ffrn u;
    public static final ffrn v;
    public static final ffrn w;
    public static final ffrn x;

    @Deprecated
    public static final ffrn y;

    @Deprecated
    public static final ffrn z;
    public final String K;
    private final Integer M;
    private final ffri N;

    static {
        ffrn ffrnVar = new ffrn(65793, "sha2-128f-robust", new ffrl(16));
        a = ffrnVar;
        ffrn ffrnVar2 = new ffrn(65794, "sha2-128s-robust", new ffrl(16));
        b = ffrnVar2;
        ffrn ffrnVar3 = new ffrn(65795, "sha2-192f-robust", new ffrl(24));
        c = ffrnVar3;
        ffrn ffrnVar4 = new ffrn(65796, "sha2-192s-robust", new ffrl(24));
        d = ffrnVar4;
        ffrn ffrnVar5 = new ffrn(65797, "sha2-256f-robust", new ffrl(32));
        e = ffrnVar5;
        ffrn ffrnVar6 = new ffrn(65798, "sha2-256s-robust", new ffrl(32));
        f = ffrnVar6;
        ffrn ffrnVar7 = new ffrn(66049, "sha2-128f", new ffrl(16));
        g = ffrnVar7;
        ffrn ffrnVar8 = new ffrn(66050, "sha2-128s", new ffrl(16));
        h = ffrnVar8;
        ffrn ffrnVar9 = new ffrn(66051, "sha2-192f", new ffrl(24));
        i = ffrnVar9;
        ffrn ffrnVar10 = new ffrn(66052, "sha2-192s", new ffrl(24));
        j = ffrnVar10;
        ffrn ffrnVar11 = new ffrn(66053, "sha2-256f", new ffrl(32));
        k = ffrnVar11;
        ffrn ffrnVar12 = new ffrn(66054, "sha2-256s", new ffrl(32));
        l = ffrnVar12;
        ffrn ffrnVar13 = new ffrn(131329, "shake-128f-robust", new ffrm(16));
        m = ffrnVar13;
        ffrn ffrnVar14 = new ffrn(131330, "shake-128s-robust", new ffrm(16));
        n = ffrnVar14;
        ffrn ffrnVar15 = new ffrn(131331, "shake-192f-robust", new ffrm(24));
        o = ffrnVar15;
        ffrn ffrnVar16 = new ffrn(131332, "shake-192s-robust", new ffrm(24));
        p = ffrnVar16;
        ffrn ffrnVar17 = new ffrn(131333, "shake-256f-robust", new ffrm(32));
        q = ffrnVar17;
        ffrn ffrnVar18 = new ffrn(131334, "shake-256s-robust", new ffrm(32));
        r = ffrnVar18;
        ffrn ffrnVar19 = new ffrn(131585, "shake-128f", new ffrm(16));
        s = ffrnVar19;
        ffrn ffrnVar20 = new ffrn(131586, "shake-128s", new ffrm(16));
        t = ffrnVar20;
        ffrn ffrnVar21 = new ffrn(131587, "shake-192f", new ffrm(24));
        u = ffrnVar21;
        ffrn ffrnVar22 = new ffrn(131588, "shake-192s", new ffrm(24));
        v = ffrnVar22;
        ffrn ffrnVar23 = new ffrn(131589, "shake-256f", new ffrm(32));
        w = ffrnVar23;
        ffrn ffrnVar24 = new ffrn(131590, "shake-256s", new ffrm(32));
        x = ffrnVar24;
        ffrn ffrnVar25 = new ffrn(196865, "haraka-128f-robust", new ffrk(16));
        y = ffrnVar25;
        ffrn ffrnVar26 = new ffrn(196866, "haraka-128s-robust", new ffrk(16));
        z = ffrnVar26;
        ffrn ffrnVar27 = new ffrn(196867, "haraka-192f-robust", new ffrk(24));
        A = ffrnVar27;
        ffrn ffrnVar28 = new ffrn(196868, "haraka-192s-robust", new ffrk(24));
        B = ffrnVar28;
        ffrn ffrnVar29 = new ffrn(196869, "haraka-256f-robust", new ffrk(32));
        C = ffrnVar29;
        ffrn ffrnVar30 = new ffrn(196870, "haraka-256s-robust", new ffrk(32));
        D = ffrnVar30;
        ffrn ffrnVar31 = new ffrn(197121, "haraka-128f-simple", new ffrk(16));
        E = ffrnVar31;
        ffrn ffrnVar32 = new ffrn(197122, "haraka-128s-simple", new ffrk(16));
        F = ffrnVar32;
        ffrn ffrnVar33 = new ffrn(197123, "haraka-192f-simple", new ffrk(24));
        G = ffrnVar33;
        ffrn ffrnVar34 = new ffrn(197124, "haraka-192s-simple", new ffrk(24));
        H = ffrnVar34;
        ffrn ffrnVar35 = new ffrn(197125, "haraka-256f-simple", new ffrk(32));
        I = ffrnVar35;
        ffrn ffrnVar36 = new ffrn(197126, "haraka-256s-simple", new ffrk(32));
        J = ffrnVar36;
        L = new HashMap();
        ffrn[] ffrnVarArr = {ffrnVar, ffrnVar2, ffrnVar3, ffrnVar4, ffrnVar5, ffrnVar6, ffrnVar7, ffrnVar8, ffrnVar9, ffrnVar10, ffrnVar11, ffrnVar12, ffrnVar13, ffrnVar14, ffrnVar15, ffrnVar16, ffrnVar17, ffrnVar18, ffrnVar19, ffrnVar20, ffrnVar21, ffrnVar22, ffrnVar23, ffrnVar24, ffrnVar25, ffrnVar26, ffrnVar27, ffrnVar28, ffrnVar29, ffrnVar30, ffrnVar31, ffrnVar32, ffrnVar33, ffrnVar34, ffrnVar35, ffrnVar36};
        for (int i2 = 0; i2 < 36; i2++) {
            ffrn ffrnVar37 = ffrnVarArr[i2];
            L.put(ffrnVar37.M, ffrnVar37);
        }
    }

    private ffrn(Integer num, String str, ffri ffriVar) {
        this.M = num;
        this.K = str;
        this.N = ffriVar;
    }

    final int a() {
        return this.N.a();
    }
}
