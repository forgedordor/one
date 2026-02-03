package defpackage;

import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elek {
    public final Readable a;
    public final Reader b;
    public final CharBuffer c;
    public final char[] d;
    public final Queue e;
    public final elei f;

    public elek(Readable readable) {
        CharBuffer charBufferAllocate = CharBuffer.allocate(2048);
        this.c = charBufferAllocate;
        this.d = charBufferAllocate.array();
        this.e = new ArrayDeque();
        this.f = new elej(this);
        this.a = readable;
        this.b = (Reader) readable;
    }
}
