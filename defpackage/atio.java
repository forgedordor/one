package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atio implements athk {
    public final cojg a;
    public final coyd b;
    private final fdjx c;
    private final aqzg d;
    private fdkf e;
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final atjr g = atjr.a;

    public atio(fdjx fdjxVar, cojg cojgVar, coyd coydVar, aqzg aqzgVar) {
        this.c = fdjxVar;
        this.a = cojgVar;
        this.b = coydVar;
        this.d = aqzgVar;
    }

    @Override // defpackage.athk
    public final atjr a() {
        return this.g;
    }

    @Override // defpackage.athk
    public final Object b(fcxy fcxyVar) {
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean.get()) {
            return fctx.a;
        }
        fdkf fdkfVar = this.e;
        if (fdkfVar != null) {
            fdkfVar.t(new CancellationException("UploadConnectionPrewarmStep cancelled"));
        }
        atomicBoolean.set(true);
        return fctx.a;
    }

    @Override // defpackage.athk
    public final Object g(fcxy fcxyVar) {
        return fctx.a;
    }

    @Override // defpackage.athk
    public final Object h(atha athaVar, atii atiiVar, fcxy fcxyVar) {
        aubq aubqVar;
        MessageCoreData messageCoreDataA;
        Optional optionalAg;
        aqzg aqzgVar = this.d;
        if (!aqzgVar.a() || (messageCoreDataA = athaVar.a()) == null || (optionalAg = messageCoreDataA.ag()) == null || (aubqVar = (aubq) fdct.b(optionalAg)) == null) {
            aubqVar = athaVar.d;
        }
        if (aqzgVar.a() && aubqVar == null) {
            return atiiVar;
        }
        this.e = fdin.b(this.c, eicg.a(fcyi.a), fdjz.a, new atin(null, this, aubqVar, athaVar));
        return atiiVar;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.athk
    public final boolean k() {
        return this.f.get();
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean l() {
        return false;
    }
}
