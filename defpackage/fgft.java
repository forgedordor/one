package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgft extends fgep {
    public final HttpURLConnection h;
    final /* synthetic */ fgfw i;
    private final AtomicBoolean j;
    private WritableByteChannel k;
    private OutputStream l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgft(fgfw fgfwVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, fggs fggsVar) {
        super(executor, executor2, fggsVar);
        this.i = fgfwVar;
        this.j = new AtomicBoolean(false);
        this.h = httpURLConnection;
    }

    @Override // defpackage.fgep
    protected final int a(ByteBuffer byteBuffer) throws IOException {
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            iWrite += this.k.write(byteBuffer);
        }
        this.l.flush();
        return iWrite;
    }

    @Override // defpackage.fgep
    protected final Runnable b(fgfx fgfxVar) {
        return new fget(this.i, fgfxVar);
    }

    @Override // defpackage.fgep
    protected final Runnable c(fgfx fgfxVar) {
        return new fgex(this.i, fgfxVar);
    }

    @Override // defpackage.fgep
    protected final void e() {
        j();
        this.i.g();
    }

    @Override // defpackage.fgep
    protected final void f() {
        if (this.k == null) {
            fgfw fgfwVar = this.i;
            fgfwVar.l = 10;
            HttpURLConnection httpURLConnection = this.h;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.connect();
            fgfwVar.l = 12;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            this.l = outputStream;
            this.k = Channels.newChannel(outputStream);
        }
    }

    @Override // defpackage.fgep
    protected final void g(Throwable th) {
        this.i.c(th);
    }

    final void j() {
        if (this.k == null || !this.j.compareAndSet(false, true)) {
            return;
        }
        this.k.close();
    }
}
