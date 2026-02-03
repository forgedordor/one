package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfn {
    public static final int a(wfm wfmVar, wfm wfmVar2) {
        wfmVar.getClass();
        wfmVar2.getClass();
        wfm wfmVar3 = wfm.a;
        if (wfmVar == wfmVar3 && wfmVar2 == wfmVar3) {
            return 1;
        }
        if (wfmVar == wfmVar3 && wfmVar2 == wfm.b) {
            return 2;
        }
        wfm wfmVar4 = wfm.b;
        if (wfmVar == wfmVar4 && wfmVar2 == wfmVar3) {
            return 3;
        }
        if (wfmVar == wfmVar4 && wfmVar2 == wfmVar4) {
            return 4;
        }
        throw new IllegalArgumentException("Unhandled state " + wfmVar.name() + " to " + wfmVar2.name());
    }
}
