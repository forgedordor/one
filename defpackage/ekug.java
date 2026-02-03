package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekug extends ekty {
    private static final boolean a = a.a();
    private static final boolean b;
    private static final ektx c;

    /* compiled from: PG */
    final class a {
        a() {
        }

        static boolean a() {
            return ekug.t();
        }
    }

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new ektx() { // from class: ekug.1
            @Override // defpackage.ektx
            public ekrq a(Class<?> cls, int i) {
                return ekrq.a;
            }

            @Override // defpackage.ektx
            public String b(Class<? extends ekqs<?>> cls) {
                StackTraceElement stackTraceElementA;
                if (ekug.a) {
                    try {
                        if (cls.equals(ekug.p())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!ekug.b || (stackTraceElementA = ekwq.a(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementA.getClassName();
            }
        };
    }

    static Class<?> p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return a.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.ekty
    protected ekta e(String str) {
        AtomicReference atomicReference = ekun.d;
        if (atomicReference.get() != null) {
            return ((ekue) atomicReference.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt != '$') {
                    if (cCharAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        ekun ekunVar = new ekun(str);
        ekul.a.offer(ekunVar);
        if (atomicReference.get() == null) {
            return ekunVar;
        }
        ekun.e();
        return ekunVar;
    }

    @Override // defpackage.ekty
    protected ektx h() {
        return c;
    }

    @Override // defpackage.ekty
    protected ekvf j() {
        return ekuo.a;
    }

    @Override // defpackage.ekty
    protected String m() {
        return "platform: Android";
    }
}
