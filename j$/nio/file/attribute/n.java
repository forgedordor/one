package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes9.dex */
public final class n implements FileAttribute {
    public final /* synthetic */ m a;

    public n(m mVar) {
        this.a = mVar;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(j$.nio.file.C.h((Set) this.a.value()));
    }
}
