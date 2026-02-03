package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqfi implements fbqz {
    @Override // defpackage.fbqz
    public final /* synthetic */ Object a(byte[] bArr) {
        bArr.getClass();
        try {
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            ezqf ezqfVar = (ezqf) evsn.parseFrom(ezqf.a, bArr, evrr.a);
            ezqfVar.getClass();
            return ezqfVar;
        } catch (evtj e) {
            eqej eqejVarD = new eqeg().d();
            eqeg eqegVar = (eqeg) eqejVarD;
            eqegVar.c = Optional.of(e);
            eqegVar.a = "Failed to parse TachyonError from bytes.";
            cmyu.a(eqejVarD.a());
            ezqf ezqfVar2 = ezqf.a;
            ezqfVar2.getClass();
            return ezqfVar2;
        }
    }

    @Override // defpackage.fbqz
    public final /* synthetic */ byte[] b(Object obj) {
        return ((ezqf) obj).toByteArray();
    }
}
