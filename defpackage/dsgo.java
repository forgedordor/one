package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsgo implements dsfb {
    public static final eksp a = eksp.c("GnpSdk");
    public final eygg A;
    public final eygg B;
    public final dxpd C;
    public final Context b;
    public final diep c;
    public final dxgg d;
    public final eygg e;
    public final eygg f;
    public final ejwi g;
    public final eygg h;
    public final eygg i;
    public final dxgg j;
    public final dxgg k;
    public final dsed l;
    public final Set m;
    public final eygg n;
    public final drzl o;
    public final Set p;
    public final eygg q;
    public final eygg r;
    public final eygg s;
    public final eygg t;
    public final String u;
    public final eygg v;
    public final dsbr w;
    public final Map x;
    public final eygg y;
    public final eygg z;

    public dsgo(Context context, diep diepVar, dxgg dxggVar, eygg eyggVar, eygg eyggVar2, ejwi ejwiVar, dxgg dxggVar2, dxgg dxggVar3, dsed dsedVar, Set set, eygg eyggVar3, drzl drzlVar, Set set2, eygg eyggVar4, eygg eyggVar5, eygg eyggVar6, eygg eyggVar7, String str, eygg eyggVar8, dsbr dsbrVar, Map map, eygg eyggVar9, eygg eyggVar10, eygg eyggVar11, dxpd dxpdVar, eygg eyggVar12, eygg eyggVar13, eygg eyggVar14) {
        this.b = context;
        this.c = diepVar;
        this.d = dxggVar;
        this.e = eyggVar;
        this.f = eyggVar2;
        this.g = ejwiVar;
        this.j = dxggVar2;
        this.k = dxggVar3;
        this.l = dsedVar;
        this.m = set;
        this.n = eyggVar3;
        this.o = drzlVar;
        this.p = set2;
        this.q = eyggVar4;
        this.r = eyggVar5;
        this.s = eyggVar6;
        this.t = eyggVar7;
        this.u = str;
        this.v = eyggVar8;
        this.w = dsbrVar;
        this.x = map;
        this.A = eyggVar10;
        this.B = eyggVar11;
        this.C = dxpdVar;
        this.z = eyggVar9;
        this.h = eyggVar12;
        this.i = eyggVar13;
        this.y = eyggVar14;
    }

    public final boolean a(ethk ethkVar) {
        evvp evvpVar = ethkVar.i;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        long jA = evxc.a(evvpVar);
        return jA > 0 && jA < this.c.f().toEpochMilli();
    }
}
