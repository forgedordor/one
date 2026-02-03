package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecgj extends ecgn implements ecfq, ecfp, ecgg {
    private final FileOutputStream a;
    private final File b;

    public ecgj(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.ecfp
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.ecgg
    public final void b() throws SyncFailedException {
        this.a.getFD().sync();
    }

    @Override // defpackage.ecfq
    public final File c() {
        return this.b;
    }
}
