package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhck extends FileTransferResult {
    private final dhda c;

    public dhck(dhda dhdaVar) {
        this.c = dhdaVar;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.FileTransferResult
    public final dhda a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileTransferResult) {
            return this.c.equals(((FileTransferResult) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FileTransferResult{resultCode=" + String.valueOf(this.c) + "}";
    }
}
