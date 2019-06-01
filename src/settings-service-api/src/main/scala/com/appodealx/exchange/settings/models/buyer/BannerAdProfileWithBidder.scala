package com.appodealx.exchange.settings.models.buyer

import com.appodealx.exchange.common.models.auction._
import com.appodealx.exchange.common.models.dto.Banner
import com.github.zafarkhaja.semver.Version

case class BannerAdProfileWithBidder(id: Option[AdProfileId] = None,
                                     bidderId: BidderId,
                                     title: Option[String],
                                     active: Boolean,
                                     debug: Boolean,
                                     adChannel: Option[Int] = None,
                                     delayedNotification: Boolean,
                                     interstitial: Boolean,
                                     reward: Boolean,
                                     ad: Banner,
                                     dmVerMax: Option[Version],
                                     dmVerMin: Option[Version],
                                     distributionChannel: Option[String],
                                     template: Option[String],
                                     bidder: Bidder,
                                     allowCache: Option[Boolean],
                                     allowCloseDelay: Option[Int]) extends AdProfileTyped[Banner]
