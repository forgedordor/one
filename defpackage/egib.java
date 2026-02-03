package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egib implements egce {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.egce
    public final ListenableFuture a() {
        egbr egbrVar = (egbr) egbs.a.createBuilder();
        egbrVar.copyOnWrite();
        egbs egbsVar = (egbs) egbrVar.instance;
        egbsVar.b |= 256;
        egbsVar.k = "pseudonymous";
        egbrVar.copyOnWrite();
        egbs egbsVar2 = (egbs) egbrVar.instance;
        egbsVar2.b |= 1;
        egbsVar2.c = "pseudonymous";
        egbrVar.copyOnWrite();
        egbs egbsVar3 = (egbs) egbrVar.instance;
        egbsVar3.b |= 2;
        egbsVar3.d = "UNHANDLED ACCOUNT TYPE ლ(ಠ益ಠლ)";
        egbrVar.copyOnWrite();
        egbs egbsVar4 = (egbs) egbrVar.instance;
        egbsVar4.b |= 16;
        egbsVar4.g = "¯\\_(ツ)_/¯";
        return eork.i(ekgb.r((egbs) egbrVar.build()));
    }
}
