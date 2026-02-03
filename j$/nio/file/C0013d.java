package j$.nio.file;

import java.nio.file.FileStore;

/* renamed from: j$.nio.file.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0013d {
    public final /* synthetic */ FileStore a;

    public C0013d(FileStore fileStore) {
        this.a = fileStore;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.a;
        if (obj instanceof C0013d) {
            obj = ((C0013d) obj).a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
