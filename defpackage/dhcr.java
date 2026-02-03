package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhcr extends dhdl {
    private FileTransferResult a;

    @Override // defpackage.dhdl
    public final ResumeDownloadResult a() {
        FileTransferResult fileTransferResult = this.a;
        if (fileTransferResult != null) {
            return new dhcs(fileTransferResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // defpackage.dhdl
    public final void b(FileTransferResult fileTransferResult) {
        if (fileTransferResult == null) {
            throw new NullPointerException("Null result");
        }
        this.a = fileTransferResult;
    }
}
