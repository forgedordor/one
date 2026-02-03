package com.google.mediapipe.framework;

import defpackage.euxa;
import defpackage.euxc;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ProtoUtil {
    static final euxc a = new euxc();
    public static final /* synthetic */ int b = 0;

    /* compiled from: PG */
    public static class SerializedMessage {
        public String typeName;
        public byte[] value;
    }

    public static String a(Class cls) {
        return (String) a.a.get(cls);
    }

    public static void b(Class cls, String str) {
        Map map = a.a;
        if (!map.containsKey(cls) || ((String) map.get(cls)).equals(str)) {
            map.put(cls, str);
            return;
        }
        throw new MediaPipeException(euxa.ALREADY_EXISTS.ordinal(), "Protobuf type name: " + str + " conflicts with: " + ((String) map.get(cls)));
    }
}
