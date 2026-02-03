package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class atli extends dqpg {
    public athh a;
    public atmy b;
    public Uri c;
    public aubx d;
    public eyfn e;
    public String f;
    public aucj g;
    public epwc h;

    public atli() {
        super(atmx.e());
        this.a = null;
    }

    public final atlg a() {
        atlh atlhVar = new atlh();
        atlhVar.aD(aB());
        atlhVar.a = this.a;
        atlhVar.b = this.b;
        atlhVar.c = this.c;
        atlhVar.d = this.d;
        atlhVar.e = this.e;
        atlhVar.f = this.f;
        atlhVar.g = this.g;
        atlhVar.h = this.h;
        atlhVar.cM = aC();
        return atlhVar;
    }

    public final void b(eyfn eyfnVar) {
        aE(4);
        this.e = eyfnVar;
    }

    public final void c(atmy atmyVar) {
        aE(1);
        this.b = atmyVar;
    }

    public final void d(epwc epwcVar) {
        int i = this.aB;
        if (i < 60700) {
            dqru.x("mls_file_metadata", i);
        }
        aE(7);
        this.h = epwcVar;
    }

    public final void e(athh athhVar) {
        aE(0);
        this.a = athhVar;
    }

    public final void f(String str) {
        aE(5);
        this.f = str;
    }

    public final void g(aucj aucjVar) {
        aE(6);
        this.g = aucjVar;
    }
}
