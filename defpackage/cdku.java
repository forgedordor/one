package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdku {
    public final cmfo c;
    public final eosc d;
    public final egzh e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final AtomicReference i;
    private static final egyj j = new egyb("GAIA_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    public static final egyj a = new egyb("GAIA_AUTH_ERROR_DATA_SOURCE_KEY");
    public static final egyk b = new egyb("GAIA_AUTH_ERROR_NONLOCAL_DATA_SOURCE_KEY");

    public cdku(cmfo cmfoVar, eosc eoscVar, egzh egzhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        new AtomicBoolean(false);
        new AtomicReference();
        this.i = new AtomicReference(egyh.a);
        this.c = cmfoVar;
        this.e = egzhVar;
        this.d = eoscVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
    }

    public final eiju a() {
        return this.c.h().h(new ejvr() { // from class: cdkl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cdjt) obj).e);
            }
        }, eoqg.a);
    }

    public final eiju b() {
        return this.c.h().h(new ejvr() { // from class: cdkc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cdjt) obj).d);
            }
        }, eoqg.a);
    }

    public final eiju c(final boolean z) {
        return this.c.j(new ejvr() { // from class: cdjz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdjq cdjqVar = (cdjq) ((cdjt) obj).toBuilder();
                cdjqVar.copyOnWrite();
                cdjt cdjtVar = (cdjt) cdjqVar.instance;
                cdjtVar.b |= 64;
                cdjtVar.h = z;
                return (cdjt) cdjqVar.build();
            }
        }).h(new ejvr() { // from class: cdkf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.e();
                return null;
            }
        }, this.d);
    }

    public final eiju d(final cdjs cdjsVar) {
        return this.c.j(new ejvr() { // from class: cdke
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdjq cdjqVar = (cdjq) ((cdjt) obj).toBuilder();
                cdjqVar.copyOnWrite();
                cdjt cdjtVar = (cdjt) cdjqVar.instance;
                cdjtVar.j = cdjsVar.d;
                cdjtVar.b |= 512;
                return (cdjt) cdjqVar.build();
            }
        }).h(new ejvr() { // from class: cdkg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.e();
                return null;
            }
        }, this.d);
    }

    public final void e() {
        this.e.a(eijx.e(null), j);
    }
}
