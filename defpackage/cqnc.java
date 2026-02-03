package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqnc {
    public static final ekrz G;
    public static final ekrz H;
    public static final ekrz I;
    public static final ekrz J;
    public static final ekrz K;
    public static final ekrz L;
    public static final ekrz M;
    public static final ekrz N;
    public static final ekrz O;
    public static final ekrz P;
    public static final ekrz Q;
    public static final ekrz R;
    public static final ekrz S;
    public static final ekrz T;
    public static final ekrz U;
    public static final ekrz V;
    public static final ekrz W;
    public static final ekrz X;
    public static final ekrz Y;
    public static final ekrz Z;
    public static final ekrz aa;
    public static final ekrz ab;
    public static final ekrz ac;
    public static final ekrz ad;
    public static final ekrz ae;
    public static final ekrz af;
    public static final ekrz ag;
    public static final ekrz ah;

    @Deprecated
    public static final ekrz a = new ekrz("message_id", String.class, false, false);
    public static final ekrz b = new ekrz("message_id", MessageIdType.class, false, false);
    public static final ekrz c = new ekrz("message_id", MessageId.class, false, false);
    public static final ekrz d = new ekrz("x_message_id", Long.class, false, false);
    public static final ekrz e = new ekrz("rcs_message_id", String.class, false, false);
    public static final ekrz f = new ekrz("rcs_message_id", basd.class, false, false);
    public static final ekrz g = new ekrz("mls_group_id", ccep.class, false, false);
    public static final ekrz h = new ekrz("original_rcs_message_id", basd.class, false, false);
    public static final ekrz i = new ekrz("message_receipt_type", String.class, false, false);
    public static final ekrz j = new ekrz("traceId", fhaz.class, false, false);
    public static final ekrz k = new ekrz("draft_id", UUID.class, false, false);
    public static final ekrz l = new ekrz("webId", String.class, false, false);
    public static final ekrz m = new ekrz("cmsId", String.class, false, false);
    public static final ekrz n = new ekrz("cmsCorrelationId", String.class, false, false);
    public static final ekrz o = new ekrz("cloudSyncId", String.class, false, false);
    public static final ekrz p = new ekrz("participant_id", String.class, false, false);
    public static final ekrz q = new ekrz("remote_user_id", CharSequence.class, false, false);

    @Deprecated
    public static final ekrz r = new ekrz("conversation_id", String.class, false, false);
    public static final ekrz s = new ekrz("conversation_id", ConversationIdType.class, false, false);
    public static final ekrz t = new ekrz("conversation_id", ConversationId.class, false, false);
    public static final ekrz u = new ekrz("thread_id_type", cnqj.class, false, false);
    public static final ekrz v = new ekrz("part_id", String.class, false, false);
    public static final ekrz w = new ekrz("sub_id", Integer.class, false, false);
    public static final ekrz x = new ekrz("icc_id", String.class, false, false);
    public static final ekrz y = new ekrz("self_identity_id", SelfIdentityId.class, false, false);
    public static final ekrz z = new ekrz("my_identity_token", axcm.class, false, false);
    public static final ekrz A = new cqno("mls_identity", ccpl.class);
    public static final ekrz B = new ekrz("content_type", String.class, false, false);
    public static final ekrz C = new ekrz("message_protocol", String.class, false, false);
    public static final ekrz D = new ekrz("file_transfer_content_uri", String.class, false, false);
    public static final ekrz E = new ekrz("duration", Duration.class, false, false);
    public static final ekrz F = new ekrz("originalMessageId", MessageIdType.class, false, false);

    static {
        new cqno("display_name", String.class);
        G = new cqno("messaging_identity", alqm.class);
        H = new ekrz("destination", String.class, false, false);
        I = new cqno("msisdn", String.class);
        J = new cqno("conversation_name", String.class);
        K = new ekrz("conversation_join_state", String.class, false, false);
        L = new ekrz("rcs_session_id", Long.class, false, false);
        M = new ekrz("rcsFtSessionId", Long.class, false, false);
        N = new cqnp("rcs_group_id", String.class);
        O = new ekrz("rcs_conference_uri", CharSequence.class, false, false);
        P = new ekrz("thread_id", Long.class, false, false);
        Q = new ekrz("sub_displayName", String.class, false, false);
        R = new ekrz("mcc_mnc", String.class, false, false);
        new ekrz("app_version", String.class, false, false);
        S = new ekrz("class_name", String.class, false, false);
        T = new ekrz("rcs_availability", String.class, false, false);
        new ekrz("chat_session_service_result", String.class, false, false);
        U = new ekrz("log_prefix", String.class, false, false);
        V = new ekrz("pcscf_host", String.class, false, false);
        W = new ekrz("grpc_host", String.class, false, false);
        X = new ekrz("grpc_port", Integer.class, false, false);
        Y = new ekrz("content_type", Integer.class, false, false);
        Z = new ekrz("annotation_id", String.class, false, false);
        new ekrz("tile_id", Integer.class, false, false);
        aa = new cqnm();
        ab = new cqnn(Uri.class, new Function() { // from class: cqnb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cqcv.f((Uri) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ac = new ekrz("datagram_id", baro.class, false, false);
        ad = new cqno("rcs_provisioning_id", dggn.class);
        ae = new cqno("rcs_provisioning_id", String.class);
        af = new ekrz("provisioning_session_id", String.class, false, false);
        ag = new ekrz("destination_token", awjl.class, false, false);
        ah = new ekrz("group_token", awpx.class, false, false);
    }
}
