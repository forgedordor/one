package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdli {
    public static final Executor a(fdjq fdjqVar) {
        Executor executorG;
        fdlg fdlgVar = fdjqVar instanceof fdlg ? (fdlg) fdjqVar : null;
        return (fdlgVar == null || (executorG = fdlgVar.g()) == null) ? new fdkp(fdjqVar) : executorG;
    }

    public static final fdjq b(Executor executor) {
        fdkp fdkpVar = executor instanceof fdkp ? (fdkp) executor : null;
        return fdkpVar != null ? fdkpVar.a : new fdlh(executor);
    }
}
