package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oml {
    public final oip a;
    public lvb b;
    public final String c;
    public final pja d;
    public boolean e;
    public final lvn f;
    public lvb g;
    public final lxk h;
    public final fctc i;
    public final oje j;
    private final ojx k;
    private final Bundle l;
    private final Bundle m;
    private final fctc n;

    public oml(oip oipVar) {
        this.a = oipVar;
        this.k = oipVar.a;
        this.l = oipVar.b;
        this.b = oipVar.c;
        this.j = oipVar.g;
        this.c = oipVar.d;
        this.m = oipVar.e;
        this.d = piz.a(oipVar);
        fctc fctcVarA = fctd.a(new fdae() { // from class: omi
            @Override // defpackage.fdae
            public final Object invoke() {
                return new lwy();
            }
        });
        this.n = fctcVarA;
        this.f = new lvn(oipVar);
        this.g = lvb.b;
        this.h = (lwy) fctcVarA.a();
        this.i = fctd.a(new fdae() { // from class: omj
            @Override // defpackage.fdae
            public final Object invoke() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                fdap fdapVar = new fdap() { // from class: omh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        lyp lypVar = (lyp) obj;
                        lypVar.getClass();
                        return new omk(lwu.a(lypVar));
                    }
                };
                int i = fdcj.a;
                lyr.b(new fdbi(omk.class), fdapVar, linkedHashMap);
                return lyr.a(linkedHashMap);
            }
        });
    }

    public final Bundle a() {
        Bundle bundle = this.l;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
        bundleA.putAll(bundle);
        return bundleA;
    }

    public final void b(lvb lvbVar) {
        lvbVar.getClass();
        this.g = lvbVar;
        c();
    }

    public final void c() {
        if (!this.e) {
            pja pjaVar = this.d;
            pjaVar.a();
            this.e = true;
            if (this.j != null) {
                lwu.c(this.a);
            }
            pjaVar.b(this.m);
        }
        if (this.b.ordinal() < this.g.ordinal()) {
            this.f.f(this.b);
        } else {
            this.f.f(this.g);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = fdcj.a;
        sb.append(new fdbi(this.a.getClass()).c());
        sb.append("(" + this.c + ')');
        sb.append(" destination=");
        sb.append(this.k);
        return sb.toString();
    }
}
