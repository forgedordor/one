package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecgi extends ecgm implements ecfq, ecfp {
    private final FileInputStream a;
    private final File b;

    public ecgi(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.ecfp
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.ecfq
    public final File c() {
        return this.b;
    }
}
