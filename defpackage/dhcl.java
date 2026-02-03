package defpackage;

import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhcl extends dhdf {
    private String a;

    @Override // defpackage.dhdf
    public final PauseDownloadRequest a() {
        String str = this.a;
        if (str != null) {
            return new dhcm(str);
        }
        throw new IllegalStateException("Missing required properties: downloadId");
    }

    @Override // defpackage.dhdf
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null downloadId");
        }
        this.a = str;
    }
}
