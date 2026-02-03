package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crwx implements crwv {
    public static final aufx a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final efnn e;
    private final fcyh f;

    static {
        aufs aufsVar = (aufs) aufx.a.createBuilder();
        aufsVar.getClass();
        aufy.c(aufw.USER, aufsVar);
        aufy.b(aufu.HIGH, aufsVar);
        aufy.d(aufsVar);
        a = aufy.a(aufsVar);
    }

    public crwx(fcyh fcyhVar, fcsu fcsuVar, cqdr cqdrVar, fcsu fcsuVar2, fcsu fcsuVar3, efnn efnnVar) {
        fcyhVar.getClass();
        fcsuVar.getClass();
        cqdrVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.f = fcyhVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = efnnVar;
    }

    @Override // defpackage.crwv
    public final Object a(crwu crwuVar, ResolvedRecipient resolvedRecipient, ajlk ajlkVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.f), new crww(null, ajlkVar, this, resolvedRecipient, crwuVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
