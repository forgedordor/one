package com.google.chat.smartmessaging.smartreply.android;

import defpackage.ejib;
import defpackage.ezcy;
import defpackage.ezdv;
import defpackage.ezdx;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class LanguageDetectorJni {
    private long langIdPtr;

    public LanguageDetectorJni() {
        this.langIdPtr = 0L;
        try {
            this.langIdPtr = loadModel();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private final synchronized void b() {
        if (this.langIdPtr != 0) {
            internalClose();
        }
        this.langIdPtr = 0L;
    }

    private native String detectLanguage(String str, float f);

    private native void internalClose();

    private native long loadModel();

    public final synchronized Locale a(ezcy ezcyVar, ejib ejibVar) {
        if (this.langIdPtr == 0) {
            return Locale.forLanguageTag(ezcyVar.j);
        }
        StringBuffer stringBuffer = new StringBuffer();
        ezdx ezdxVar = ezcyVar.f;
        if (ezdxVar == null) {
            ezdxVar = ezdx.a;
        }
        for (ezdv ezdvVar : ezdxVar.b) {
            String str = ezdvVar.b == 30 ? (String) ezdvVar.c : "";
            if (stringBuffer.length() != 0 && !str.isEmpty()) {
                stringBuffer.append(" ");
            }
            if (!str.isEmpty()) {
                stringBuffer.append(str);
            }
        }
        String strDetectLanguage = detectLanguage(stringBuffer.toString(), ejibVar.c);
        if (strDetectLanguage == null) {
            strDetectLanguage = ezcyVar.j;
        }
        return Locale.forLanguageTag(strDetectLanguage);
    }

    protected final void finalize() {
        b();
    }
}
