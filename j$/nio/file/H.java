package j$.nio.file;

import java.nio.file.WatchKey;

/* loaded from: classes9.dex */
public final /* synthetic */ class H {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ H(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ H a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new H(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
