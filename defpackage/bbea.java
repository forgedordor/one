package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbea implements alff {
    public final String a;
    private final String b;
    private final alfd c = alfd.h;

    public bbea(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.b = smartSuggestionItemSuggestionData.a;
        this.a = smartSuggestionItemSuggestionData.p();
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.c;
    }

    @Override // defpackage.alff
    public final String b() {
        return this.b;
    }
}
