package com.google.gson.internal.bind;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import defpackage.esyd;
import defpackage.esyi;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.esyy;
import defpackage.eszu;
import defpackage.etcz;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements esyw {
    public static final esyw a = new DummyTypeAdapterFactory();
    private static final esyw d = new DummyTypeAdapterFactory();
    public final eszu b;
    public final ConcurrentMap c = new ConcurrentHashMap();

    /* compiled from: PG */
    private static class DummyTypeAdapterFactory implements esyw {
        @Override // defpackage.esyw
        public final esyv a(esyd esydVar, etcz etczVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    public JsonAdapterAnnotationTypeAdapterFactory(eszu eszuVar) {
        this.b = eszuVar;
    }

    public static esyy d(Class cls) {
        return (esyy) cls.getAnnotation(esyy.class);
    }

    public static Object e(eszu eszuVar, Class cls) {
        return eszuVar.a(new etcz(cls), true).a();
    }

    @Override // defpackage.esyw
    public final esyv a(esyd esydVar, etcz etczVar) {
        esyy esyyVarD = d(etczVar.a);
        if (esyyVarD == null) {
            return null;
        }
        return b(this.b, esydVar, etczVar, esyyVarD, true);
    }

    final esyv b(eszu eszuVar, esyd esydVar, etcz etczVar, esyy esyyVar, boolean z) {
        ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1;
        esyv esyvVarA;
        Object objE = e(eszuVar, esyyVar.a());
        boolean z2 = objE instanceof esyv;
        boolean zB = esyyVar.b();
        if (z2) {
            esyvVarA = (esyv) objE;
        } else if (objE instanceof esyw) {
            esyw esywVarC = (esyw) objE;
            if (z) {
                esywVarC = c(etczVar.a, esywVarC);
            }
            esyvVarA = esywVarC.a(esydVar, etczVar);
        } else {
            if (objE instanceof ConversationSuggestionResponseSerializer.AnonymousClass1) {
                anonymousClass1 = (ConversationSuggestionResponseSerializer.AnonymousClass1) objE;
            } else {
                if (!(objE instanceof esyi)) {
                    throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objE.getClass().getName() + " as a @JsonAdapter for " + etczVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                }
                anonymousClass1 = null;
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(anonymousClass1, objE instanceof esyi ? (esyi) objE : null, esydVar, etczVar, z ? a : d, zB);
            zB = false;
            esyvVarA = treeTypeAdapter;
        }
        return (esyvVarA == null || !zB) ? esyvVarA : esyvVarA.d();
    }

    public final esyw c(Class cls, esyw esywVar) {
        esyw esywVar2 = (esyw) this.c.putIfAbsent(cls, esywVar);
        return esywVar2 != null ? esywVar2 : esywVar;
    }
}
