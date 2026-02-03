package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amvn implements Function {
    final /* synthetic */ MessagesTable.BindData a;

    public amvn(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        ConversationSuggestion conversationSuggestion = (ConversationSuggestion) obj;
        String strSerializeToJson = ConversationSuggestionResponseSerializer.serializeToJson(conversationSuggestion);
        String propertyValue = conversationSuggestion.getSuggestionType() == 0 ? conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT) : strSerializeToJson;
        if (strSerializeToJson == null || propertyValue == null) {
            return null;
        }
        if (dflx.a()) {
            MessagesTable.BindData bindData = this.a;
            if (bindData.I().k() && (str = bindData.I().b) != null) {
                conversationSuggestion.setRcsMessageId(str);
                conversationSuggestion.setTargetRcsMessageId(str);
            }
        }
        return new RbmSuggestionData(conversationSuggestion, this.a.E(), new amvm(strSerializeToJson, propertyValue));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
