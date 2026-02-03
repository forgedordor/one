package defpackage;

import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehog extends eyhj {
    public ehog(ea eaVar) {
        super(eaVar);
    }

    public static final void a(ea eaVar, evuh evuhVar) {
        eyhj.e(eaVar);
        Bundle bundle = eaVar.m;
        evuhVar.getClass();
        ProtoParsers.j(bundle, "TIKTOK_FRAGMENT_ARGUMENT", evuhVar);
    }

    public static final void b(ea eaVar, String str) {
        eyhj.e(eaVar);
        Bundle bundle = eaVar.m;
        str.getClass();
        bundle.putString("TIKTOK_FRAGMENT_ARGUMENT", str);
    }

    @Override // defpackage.eyhj
    protected final void c(ea eaVar) {
        Class<?> cls = eaVar.getClass();
        eg egVarG = eaVar.G();
        cls.getSimpleName();
        egVarG.getClass();
        ejwl.r(eaVar.G() instanceof ehnq, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", eaVar.getClass().getSimpleName(), eaVar.G().getClass().getSimpleName());
    }
}
