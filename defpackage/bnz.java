package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnz extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
    }
}
