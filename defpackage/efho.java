package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_FileTransferInformation;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efho extends efiy {
    private FileInformation a;
    private Optional b;
    private Optional c;
    private Optional d;

    public efho() {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
    }

    @Override // defpackage.efiy
    public final FileTransferInformation a() {
        FileInformation fileInformation = this.a;
        if (fileInformation != null) {
            return new AutoValue_FileTransferInformation(fileInformation, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: fileInformation");
    }

    @Override // defpackage.efiy
    public final void b(evqs evqsVar) {
        this.c = Optional.of(evqsVar);
    }

    @Override // defpackage.efiy
    public final void c(FileInformation fileInformation) {
        if (fileInformation == null) {
            throw new NullPointerException("Null fileInformation");
        }
        this.a = fileInformation;
    }

    @Override // defpackage.efiy
    public final void d(evqs evqsVar) {
        this.d = Optional.of(evqsVar);
    }

    @Override // defpackage.efiy
    public final void e(FileInformation fileInformation) {
        this.b = Optional.of(fileInformation);
    }

    public efho(FileTransferInformation fileTransferInformation) {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        AutoValue_FileTransferInformation autoValue_FileTransferInformation = (AutoValue_FileTransferInformation) fileTransferInformation;
        this.a = autoValue_FileTransferInformation.a;
        this.b = autoValue_FileTransferInformation.b;
        this.c = autoValue_FileTransferInformation.c;
        this.d = autoValue_FileTransferInformation.d;
    }
}
