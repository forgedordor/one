package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface cquc extends Closeable {
    public static final cquc d = new cquc() { // from class: cqua
        @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            cqub.a(this);
        }

        @Override // defpackage.cquc
        public final void a() {
        }
    };

    void a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
