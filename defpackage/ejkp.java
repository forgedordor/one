package defpackage;

import com.google.chat.smartmessaging.smartreply.android.LanguageDetectorJni;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkp {
    public static final ekrg a = ekrg.c("com/google/chat/smartmessaging/smartreply/android/SmartReplyLib");
    public final ejpb b;
    public final ejjv c;
    public Optional d;
    public LanguageDetectorJni e;
    public final ejol f;
    public final ekgb g;
    public final ekhx h;
    public final crfh i;

    public ejkp(ejpb ejpbVar, ejjv ejjvVar, Optional optional, LanguageDetectorJni languageDetectorJni, ejol ejolVar, ekgb ekgbVar, ekhx ekhxVar, crfh crfhVar) throws ejkv {
        if (ejolVar == null) {
            throw new ejkv("Cannot initialize SmartReplyLib without sensitivity classifier");
        }
        if (ekgbVar == null || ekgbVar.isEmpty()) {
            throw new ejkv("Cannot initialize SmartReplyLib without suggestion providers");
        }
        this.b = ejpbVar;
        this.c = ejjvVar;
        this.d = optional;
        this.e = languageDetectorJni;
        this.f = ejolVar;
        this.g = ekgbVar;
        this.h = ekhxVar;
        this.i = crfhVar;
    }

    public static ejpb a(ejji ejjiVar) {
        return new ejpb(ejjiVar, new ejot());
    }
}
