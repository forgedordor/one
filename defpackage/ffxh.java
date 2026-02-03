package defpackage;

import j$.io.BufferedReaderRetargetInterface;
import j$.io.DesugarBufferedReader;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffxh extends BufferedReader implements BufferedReaderRetargetInterface {
    public ffxh(Reader reader) {
        super(reader);
    }

    @Override // java.io.BufferedReader, j$.io.BufferedReaderRetargetInterface
    public final /* synthetic */ Stream lines() {
        return DesugarBufferedReader.lines(this);
    }
}
