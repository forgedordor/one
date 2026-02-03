package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.auth.IAuthManagerService;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbmq {
    public static final String[] b = {"com.google", "com.google.work", "cn.google"};
    public static final String c = "androidPackageName";
    public static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final dcmc a = new dcmc("Auth", "GoogleAuthUtil");

    private static void a(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = c;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static TokenData b(final Context context, final Account account, final String str, Bundle bundle) throws Exception {
        final long j;
        Exception exc;
        final Bundle bundle2;
        dbmp dbmpVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final dbme dbmeVarA = dbme.a(context);
        try {
            dclh.g("Calling this from your main thread can lead to deadlock");
            dclh.l(str, "Scope cannot be empty or null.");
            l(account);
            g(context, 8400000);
            if (bundle == null) {
                try {
                    bundle2 = new Bundle();
                } catch (Exception e) {
                    exc = e;
                    j = jCurrentTimeMillis;
                    dbmeVarA.b(1709, 13, j, System.currentTimeMillis(), jElapsedRealtime);
                    throw exc;
                }
            } else {
                bundle2 = new Bundle(bundle);
            }
            a(context, bundle2);
            j = jCurrentTimeMillis;
            try {
                dbmpVar = new dbmp() { // from class: dbmm
                    @Override // defpackage.dbmp
                    public final Object a(IBinder iBinder) throws dbmi, IOException {
                        TokenData tokenData;
                        String strA;
                        String[] strArr = dbmq.b;
                        Bundle tokenByAccount = IAuthManagerService.Stub.asInterface(iBinder).getTokenByAccount(account, str, bundle2);
                        if (tokenByAccount == null) {
                            throw new IOException("Service call returned null");
                        }
                        ClassLoader classLoader = TokenData.class.getClassLoader();
                        if (classLoader != null) {
                            tokenByAccount.setClassLoader(classLoader);
                        }
                        Bundle bundle3 = tokenByAccount.getBundle("tokenDetails");
                        if (bundle3 == null) {
                            tokenData = null;
                        } else {
                            if (classLoader != null) {
                                bundle3.setClassLoader(classLoader);
                            }
                            tokenData = (TokenData) bundle3.getParcelable("TokenData");
                        }
                        long j2 = jElapsedRealtime;
                        long j3 = j;
                        dbme dbmeVar = dbmeVarA;
                        if (tokenData != null) {
                            dbmeVar.b(1709, 0, j3, System.currentTimeMillis(), j2);
                            return tokenData;
                        }
                        String string = tokenByAccount.getString("Error");
                        Intent intent = (Intent) tokenByAccount.getParcelable("userRecoveryIntent");
                        PendingIntent pendingIntent = (PendingIntent) tokenByAccount.getParcelable("userRecoveryPendingIntent");
                        int i = 49500;
                        while (true) {
                            if (i < 50000) {
                                if (i != 495243) {
                                    switch (i) {
                                        case 49500:
                                            strA = "AccountNotPresent";
                                            break;
                                        case 49501:
                                            strA = "AppSuspended";
                                            break;
                                        case 49502:
                                            strA = "InvalidScope";
                                            break;
                                        case 49503:
                                            strA = "NeedPermission";
                                            break;
                                        case 49504:
                                            strA = "NeedRemoteConsent";
                                            break;
                                        case 49505:
                                            strA = "PermissionDenied";
                                            break;
                                        case 49506:
                                            strA = "UnknownError";
                                            break;
                                        default:
                                            switch (i) {
                                                case 49508:
                                                    strA = "ServiceUnavailable";
                                                    break;
                                                case 49509:
                                                    strA = "InvalidRequest";
                                                    break;
                                                case 49510:
                                                    strA = "EmptyConsumerPackageOrSignature";
                                                    break;
                                                case 49511:
                                                    strA = "NeedsTwoFactorAuth";
                                                    break;
                                                case 49512:
                                                    strA = "NeedsBrowser";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 49514:
                                                            strA = "UserCancel";
                                                            break;
                                                        case 49515:
                                                            strA = "RestrictedClient";
                                                            break;
                                                        case 49516:
                                                            strA = "InvalidAudience";
                                                            break;
                                                        case 49517:
                                                            strA = "UnregisteredOnApiConsole";
                                                            break;
                                                        case 49518:
                                                            strA = "ThirdPartyDeviceManagementRequired";
                                                            break;
                                                        case 49519:
                                                            strA = "DeviceManagementInternalError";
                                                            break;
                                                        case 49520:
                                                            strA = "DeviceManagementSyncDisabled";
                                                            break;
                                                        case 49521:
                                                            strA = "DeviceManagementAdminBlocked";
                                                            break;
                                                        case 49522:
                                                            strA = "DeviceManagementAdminPendingApproval";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 49524:
                                                                    strA = "DeviceManagementDeactivated";
                                                                    break;
                                                                case 49525:
                                                                    strA = "DeviceManagementScreenLockRequired";
                                                                    break;
                                                                case 49526:
                                                                    strA = "DeviceManagementRequired";
                                                                    break;
                                                                case 49527:
                                                                    strA = "DeviceManagementRequiredOrSyncDisabled";
                                                                    break;
                                                                case 49528:
                                                                    strA = "AuthSecurityError";
                                                                    break;
                                                                case 49529:
                                                                    strA = "AuthBindingError";
                                                                    break;
                                                                case 49530:
                                                                    strA = "BadAuthentication";
                                                                    break;
                                                                case 49531:
                                                                    strA = "NetworkError";
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 49754:
                                                                            strA = "CapabilityResponseYes";
                                                                            break;
                                                                        case 49755:
                                                                            strA = "CapabilityResponseNo";
                                                                            break;
                                                                        case 49756:
                                                                            strA = "CapabilityResponseNotPermitted";
                                                                            break;
                                                                        case 49757:
                                                                            strA = "CapabilityResponseRequestFailed";
                                                                            break;
                                                                        case 49758:
                                                                            strA = "CapabilityResponseUnknownCapability";
                                                                            break;
                                                                        case 49759:
                                                                            strA = "CapabilityResponseFailedToSync";
                                                                            break;
                                                                        default:
                                                                            strA = dcfi.a(i);
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    strA = "DeviceManagementStaleSyncRequired";
                                }
                                if (!strA.equals(string)) {
                                    i++;
                                }
                            } else {
                                i = 13;
                            }
                        }
                        Context context2 = context;
                        dbmeVar.b(1709, i, j3, System.currentTimeMillis(), j2);
                        dbmq.h(context2, "getTokenWithDetails", string, intent, pendingIntent);
                        throw new dbmi("Invalid state. Shouldn't happen");
                    }
                };
                dbmeVarA = dbmeVarA;
            } catch (Exception e2) {
                e = e2;
                dbmeVarA = dbmeVarA;
            }
        } catch (Exception e3) {
            e = e3;
            j = jCurrentTimeMillis;
        }
        try {
            return (TokenData) i(context, d, dbmpVar);
        } catch (Exception e4) {
            e = e4;
            exc = e;
            dbmeVarA.b(1709, 13, j, System.currentTimeMillis(), jElapsedRealtime);
            throw exc;
        }
    }

    public static String c(Context context, String str) throws dbmi {
        dclh.l(str, "accountName must be provided");
        dclh.g("Calling this from your main thread can lead to deadlock");
        g(context, 8400000);
        return e(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    public static String d(Context context, Account account, String str) {
        return e(context, account, str, new Bundle());
    }

    public static String e(Context context, Account account, String str, Bundle bundle) {
        l(account);
        return b(context, account, str, bundle).b;
    }

    public static void f(Context context, String str) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        dbme dbmeVarA = dbme.a(context);
        try {
            dclh.g("Calling this from your main thread can lead to deadlock");
            g(context, 8400000);
            Bundle bundle = new Bundle();
            a(context, bundle);
            i(context, d, new dbmn(str, bundle));
            dbmeVarA.b(1707, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
        } catch (Exception e) {
            dbmeVarA.b(1707, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw e;
        }
    }

    public static void g(Context context, int i) throws dbmi {
        try {
            dceq.d(context.getApplicationContext(), i);
        } catch (GooglePlayServicesIncorrectManifestValueException | dcen e) {
            throw new dbmi(e.getMessage(), e);
        } catch (dceo e2) {
            throw new dbmt(e2.getMessage(), e2.a());
        }
    }

    public static void h(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws dbmi, IOException {
        dbts dbtsVarA = dbts.a(str2);
        dcmc dcmcVar = a;
        dcmcVar.e(String.format("[GoogleAuthUtil] error status:%s with method:%s", dbtsVarA, str), new Object[0]);
        if (!dbts.BAD_AUTHENTICATION.equals(dbtsVarA) && !dbts.CAPTCHA.equals(dbtsVarA) && !dbts.NEED_PERMISSION.equals(dbtsVarA) && !dbts.NEED_REMOTE_CONSENT.equals(dbtsVarA) && !dbts.NEEDS_BROWSER.equals(dbtsVarA) && !dbts.USER_CANCEL.equals(dbtsVarA) && !dbts.DEVICE_MANAGEMENT_REQUIRED.equals(dbtsVarA) && !dbts.DM_INTERNAL_ERROR.equals(dbtsVarA) && !dbts.DM_SYNC_DISABLED.equals(dbtsVarA) && !dbts.DM_ADMIN_BLOCKED.equals(dbtsVarA) && !dbts.DM_ADMIN_PENDING_APPROVAL.equals(dbtsVarA) && !dbts.DM_STALE_SYNC_REQUIRED.equals(dbtsVarA) && !dbts.DM_DEACTIVATED.equals(dbtsVarA) && !dbts.DM_REQUIRED.equals(dbtsVarA) && !dbts.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(dbtsVarA) && !dbts.DM_SCREENLOCK_REQUIRED.equals(dbtsVarA)) {
            if (!dbts.NETWORK_ERROR.equals(dbtsVarA) && !dbts.SERVICE_UNAVAILABLE.equals(dbtsVarA) && !dbts.INTNERNAL_ERROR.equals(dbtsVarA) && !dbts.AUTH_SECURITY_ERROR.equals(dbtsVarA) && !dbts.ACCOUNT_NOT_PRESENT.equals(dbtsVarA)) {
                throw new dbmi(str2);
            }
            throw new IOException(str2);
        }
        dzzh.f(context);
        if (pendingIntent != null && intent != null) {
            throw new UserRecoverableAuthException(str2, intent, dbmy.AUTH_INSTANTIATION);
        }
        dcdt dcdtVar = dcdt.a;
        int iA = dceq.a(context);
        if (iA >= 233800000 && pendingIntent == null) {
            dcmcVar.c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(iA), str, 233800000), new Object[0]);
        }
        if (intent == null) {
            dcmcVar.c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    public static Object i(Context context, ComponentName componentName, dbmp dbmpVar) throws IOException {
        dcdn dcdnVar = new dcdn();
        dckq dckqVarA = dckq.a(context);
        try {
            try {
                if (!dckqVarA.d(new dckp(componentName, dckq.a), dcdnVar, "GoogleAuthUtil").c()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    dclh.g("BlockingServiceConnection.getService() called on main thread");
                    if (dcdnVar.a) {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                    dcdnVar.a = true;
                    return dbmpVar.a((IBinder) dcdnVar.b.take());
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                }
            } finally {
                dckqVarA.b(componentName, dcdnVar);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static Account[] j(Context context) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        dbme dbmeVarA = dbme.a(context);
        try {
            dclh.k("com.google");
            try {
                int i = dcdu.c;
                dceq.d(context, 8400000);
                dclh.m(context);
                ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
                if (contentProviderClientAcquireContentProviderClient == null) {
                    throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                }
                try {
                    try {
                        Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("get_accounts", "com.google", new Bundle());
                        if (bundleCall == null) {
                            throw new RemoteException("Null result from AccountChimeraContentProvider");
                        }
                        Parcelable[] parcelableArray = bundleCall.getParcelableArray("accounts");
                        if (parcelableArray == null) {
                            throw new RemoteException("Key_Accounts is Null");
                        }
                        Account[] accountArr = new Account[parcelableArray.length];
                        for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                            accountArr[i2] = (Account) parcelableArray[i2];
                        }
                        contentProviderClientAcquireContentProviderClient.release();
                        dbmeVarA.b(1708, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                        return accountArr;
                    } catch (Throwable th) {
                        contentProviderClientAcquireContentProviderClient.release();
                        throw th;
                    }
                } catch (RemoteException e) {
                    a.d("RemoteException when fetching accounts", e, new Object[0]);
                    throw e;
                } catch (Exception e2) {
                    a.d("Exception when getting accounts", e2, new Object[0]);
                    throw new RemoteException("Accounts ContentProvider failed: " + e2.getMessage());
                }
            } catch (GooglePlayServicesIncorrectManifestValueException unused) {
                throw new dcen(18);
            }
        } catch (Exception e3) {
            dbmeVarA.b(1708, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw e3;
        }
    }

    public static void k(Object obj) {
        if (obj != null) {
            return;
        }
        a.e("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }
}
