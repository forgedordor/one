package defpackage;

import androidx.profileinstaller.ProfileInstallReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pas implements pax {
    final /* synthetic */ ProfileInstallReceiver a;

    public pas(ProfileInstallReceiver profileInstallReceiver) {
        this.a = profileInstallReceiver;
    }

    @Override // defpackage.pax
    public final void a(int i, Object obj) {
        pay.b.a(i, obj);
        this.a.setResultCode(i);
    }

    @Override // defpackage.pax
    public final void b() {
        pay.b.b();
    }
}
