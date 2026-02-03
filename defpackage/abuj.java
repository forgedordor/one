package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.nio.channels.DesugarChannels;
import j$.util.Optional;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuj extends fcyz implements fdat {
    int a;
    final /* synthetic */ abuk b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abuj(fcxy fcxyVar, abuk abukVar, String str) {
        super(2, fcxyVar);
        this.b = abukVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abuj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
            ejgzVar.getClass();
            ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
            ejhbVar.getClass();
            ejhd.c(this.c, ejhbVar);
            ejhd.b("genai-models-group", ejhbVar);
            ejgy.b(ejhd.a(ejhbVar), ejgzVar);
            ListenableFuture listenableFutureD = this.b.a.d(ejgy.a(ejgzVar));
            listenableFutureD.getClass();
            this.a = 1;
            obj = fdxs.c(listenableFutureD, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        String str = (String) fdct.b((Optional) obj);
        if (str == null) {
            return null;
        }
        String path = Uri.parse(fdgn.q(str, "android://", "file:///data/user/0/")).getPath();
        try {
            if (path == null) {
                throw new IllegalStateException("Invalid filepath when loading Emotify model");
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            try {
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                try {
                    MappedByteBuffer map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                    map.load();
                    if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    }
                    randomAccessFile.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            throw new IllegalStateException("Error loading Model file", e);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        abuj abujVar = new abuj(fcxyVar, this.b, this.c);
        abujVar.d = obj;
        return abujVar;
    }
}
