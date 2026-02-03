package com.google.gson.internal.bind;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import defpackage.esyd;
import defpackage.esyi;
import defpackage.esyj;
import defpackage.esyl;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.eszw;
import defpackage.etas;
import defpackage.etbn;
import defpackage.etbo;
import defpackage.etcz;
import defpackage.etdb;
import defpackage.etdd;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TreeTypeAdapter extends etbn {
    final esyd a;
    private final esyi b;
    private final etcz c;
    private final esyw d;
    private final etbo e = new etbo();
    private final boolean f;
    private volatile esyv g;
    private final ConversationSuggestionResponseSerializer.AnonymousClass1 h;

    /* compiled from: PG */
    public static final class SingleTypeFactory implements esyw {
        private final etcz a;
        private final boolean b;
        private final esyi c;
        private final ConversationSuggestionResponseSerializer.AnonymousClass1 d;

        public SingleTypeFactory(Object obj, etcz etczVar, boolean z) {
            ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1 = obj instanceof ConversationSuggestionResponseSerializer.AnonymousClass1 ? (ConversationSuggestionResponseSerializer.AnonymousClass1) obj : null;
            this.d = anonymousClass1;
            esyi esyiVar = obj instanceof esyi ? (esyi) obj : null;
            this.c = esyiVar;
            boolean z2 = true;
            if (anonymousClass1 == null && esyiVar == null) {
                z2 = false;
            }
            eszw.a(z2);
            this.a = etczVar;
            this.b = z;
        }

        @Override // defpackage.esyw
        public final esyv a(esyd esydVar, etcz etczVar) {
            etcz etczVar2 = this.a;
            if (etczVar2.equals(etczVar) || (this.b && etczVar2.b == etczVar.a)) {
                return new TreeTypeAdapter(this.d, this.c, esydVar, etczVar, this, true);
            }
            return null;
        }
    }

    public TreeTypeAdapter(ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1, esyi esyiVar, esyd esydVar, etcz etczVar, esyw esywVar, boolean z) {
        this.h = anonymousClass1;
        this.b = esyiVar;
        this.a = esydVar;
        this.c = etczVar;
        this.d = esywVar;
        this.f = z;
    }

    private final esyv e() {
        esyv esyvVar = this.g;
        if (esyvVar != null) {
            return esyvVar;
        }
        esyv esyvVarC = this.a.c(this.d, this.c);
        this.g = esyvVarC;
        return esyvVarC;
    }

    @Override // defpackage.esyv
    public final Object a(etdb etdbVar) {
        esyi esyiVar = this.b;
        if (esyiVar == null) {
            return e().a(etdbVar);
        }
        esyj esyjVarA = etas.a(etdbVar);
        if (this.f && (esyjVarA instanceof esyl)) {
            return null;
        }
        etcz etczVar = this.c;
        return esyiVar.deserialize(esyjVarA, etczVar.b, this.e);
    }

    @Override // defpackage.esyv
    public final void b(etdd etddVar, Object obj) throws IOException {
        ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1 = this.h;
        if (anonymousClass1 == null) {
            e().b(etddVar, obj);
            return;
        }
        if (this.f && obj == null) {
            etddVar.j();
            return;
        }
        etcz etczVar = this.c;
        etas.b(anonymousClass1.serialize(obj, etczVar.b, this.e), etddVar);
    }

    @Override // defpackage.etbn
    public final esyv c() {
        return this.h != null ? this : e();
    }
}
