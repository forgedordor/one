package org.chromium.base;

import j$.util.Optional;

/* compiled from: PG */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface Callback<T> {

    /* compiled from: PG */
    public final class Helper {
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.a(Boolean.valueOf(z));
        }

        static void onIntResultFromNative(Callback callback, int i) {
            callback.a(Integer.valueOf(i));
        }

        static void onLongResultFromNative(Callback callback, long j) {
            callback.a(Long.valueOf(j));
        }

        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.a(obj);
        }

        static void onOptionalStringResultFromNative(Callback<Optional<String>> callback, boolean z, String str) {
            callback.a(z ? Optional.of(str) : Optional.empty());
        }

        static void onTimeResultFromNative(Callback callback, long j) {
            callback.a(Long.valueOf(j));
        }

        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }

    void a(Object obj);
}
