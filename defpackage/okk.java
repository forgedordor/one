package defpackage;

import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okk {
    public static final okq a(String str, String str2) {
        String strSubstring;
        okq okqVar = okq.a;
        okq okoVar = null;
        if (!fdbq.f("integer", str)) {
            okqVar = okq.c;
            if (!fdbq.f("integer[]", str)) {
                okqVar = okq.d;
                if (!fdbq.f("List<Int>", str)) {
                    okqVar = okq.e;
                    if (!fdbq.f(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG, str)) {
                        okqVar = okq.f;
                        if (!fdbq.f("long[]", str)) {
                            okqVar = okq.g;
                            if (!fdbq.f("List<Long>", str)) {
                                okqVar = okq.k;
                                if (!fdbq.f("boolean", str)) {
                                    okqVar = okq.l;
                                    if (!fdbq.f("boolean[]", str)) {
                                        okqVar = okq.m;
                                        if (!fdbq.f("List<Boolean>", str)) {
                                            okqVar = okq.n;
                                            if (!fdbq.f("string", str)) {
                                                okqVar = okq.o;
                                                if (!fdbq.f("string[]", str)) {
                                                    okqVar = okq.p;
                                                    if (!fdbq.f("List<String>", str)) {
                                                        okqVar = okq.h;
                                                        if (!fdbq.f("float", str)) {
                                                            okqVar = okq.i;
                                                            if (!fdbq.f("float[]", str)) {
                                                                okqVar = okq.j;
                                                                if (!fdbq.f("List<Float>", str)) {
                                                                    okqVar = null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (okqVar != null) {
            return okqVar;
        }
        okq okqVar2 = okq.b;
        if (fdbq.f("reference", str)) {
            return okqVar2;
        }
        if (str.length() == 0) {
            return okq.n;
        }
        try {
            if (!fdgn.t(str, ".") || str2 == null) {
                strSubstring = str;
            } else {
                strSubstring = str2 + str;
            }
            boolean zN = fdgn.n(str, "[]");
            if (zN) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                strSubstring.getClass();
            }
            Class<?> cls = Class.forName(strSubstring);
            cls.getClass();
            if (Parcelable.class.isAssignableFrom(cls)) {
                okoVar = zN ? new okm(cls) : new okn(cls);
            } else if (Enum.class.isAssignableFrom(cls) && !zN) {
                okoVar = new okl(cls);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                okoVar = zN ? new oko(cls) : new okp(cls);
            }
            if (okoVar != null) {
                return okoVar;
            }
            throw new IllegalArgumentException(a.x(strSubstring, " is not Serializable or Parcelable."));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
