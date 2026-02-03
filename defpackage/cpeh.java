package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.util.LegacyGroupProtocolSwitchAction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpeh implements ayms {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;

    public cpeh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LegacyGroupProtocolSwitchAction c(Parcel parcel) {
        byeb byebVar = (byeb) this.b.b();
        byebVar.getClass();
        bbdl bbdlVar = (bbdl) this.c.b();
        bbdlVar.getClass();
        cogw cogwVar = (cogw) this.d.b();
        cogwVar.getClass();
        parcel.getClass();
        return new LegacyGroupProtocolSwitchAction(this.a, byebVar, bbdlVar, cogwVar, parcel);
    }
}
