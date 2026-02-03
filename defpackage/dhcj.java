package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhcj extends dhcz {
    private dhda a;

    @Override // defpackage.dhcz
    public final FileTransferResult a() {
        if (this.a != null) {
            return new dhck(this.a);
        }
        throw new IllegalStateException("Missing required properties: resultCode");
    }

    @Override // defpackage.dhcz
    public final void b(dhda dhdaVar) {
        if (dhdaVar == null) {
            throw new NullPointerException("Null resultCode");
        }
        this.a = dhdaVar;
    }
}
